node {
    git url: 'https://github.com/ros-industrial/staubli_experimental.git', branch: 'kinetic-devel'
    registerROS('ros:kinetic-desktop-full', [
        'ros-kinetic-staubli',
        'ros-kinetic-industrial-robot-client',
        'ros-kinetic-moveit-core'
    ], [])
}
