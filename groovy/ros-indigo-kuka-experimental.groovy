node {
    git url: 'https://github.com/ros-industrial/kuka_experimental.git', branch: 'indigo-devel'
    registerROS('ros:indigo-desktop', [
        'ros-indigo-controller-manager',
        'ros-indigo-industrial-robot-client',
        'ros-indigo-joint-limits-interface'
    ], [])
}
