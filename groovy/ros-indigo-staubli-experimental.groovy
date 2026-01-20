node {
    git url: 'https://github.com/ros-industrial/staubli_experimental.git', branch: 'indigo-devel'
    registerROS('ros:indigo-desktop-full', [
        'ros-indigo-staubli',
        'ros-indigo-industrial-robot-client',
        'ros-indigo-moveit-core'
    ], [])
}
